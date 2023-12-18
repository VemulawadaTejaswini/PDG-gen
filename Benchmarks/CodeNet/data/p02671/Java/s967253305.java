import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length = (int)(Math.pow(3, n));
		Person.size = n;
		Person[] persons = new Person[length];
		for (int i = 0; i < length; i++) {
		    persons[i] = new Person(i);
		}
		ArrayList<Integer> list = new ArrayList<>();
		char[] arr = sc.next().toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == 'R') {
		        count++;
		    } else {
		        if (i < arr.length - 1 && arr[i + 1] == 'S') {
		            i++;
		        } else {
		            list.add(count);
		            count = 0;
		        }
		    }
		}
		list.add(count);
		Person.list = list;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
		    if (i > 0) {
		        sb.append(" ");
		    }
		    persons[i].calc();
		    sb.append(persons[i].getValue());
		}
		System.out.println(sb);
	}
	
	static class Person {
	    static int size;
	    static ArrayList<Integer> list;
	    int[] base;
	    
	    public Person(int value) {
	        base = new int[size];
	        for (int i = 0; i < size && value > 0; i++) {
	            base[i] = value % 3;
	            value /= 3;
	        }
	    }
	    
	    public void calc() {
	        for (int i = 0; i < list.size(); i++) {
	            int x = list.get(i);
	            for (int j = 0; j < size && x > 0; j++) {
	                int mod = x % 3;
	                x /= 3;
                    if (base[j] + mod >= 3) {
                        x++;
                    }
                    base[j] = (base[j] + mod) % 3;
	            }
	            if (i >= list.size() - 1) {
	                break;
	            }
	            for (int j = 0; j < size; j++) {
	                if (base[j] == 2) {
	                    base[j] = 1;
	                } else if (base[j] == 1) {
	                    base[j] = 2;
	                }
	            }
	        }
	    }
	    
	    public int getValue() {
	        int ans = 0;
	        for (int i = size - 1; i >= 0; i--) {
	            ans *= 3;
	            ans += base[i];
	        }
	        return ans;
	    }
	}
}

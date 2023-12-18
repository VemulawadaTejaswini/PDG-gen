import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
		    Person[] p = new Person[8];
		    Person[] nizi = new Person[18];
		    for(int i= 0; i < 3; i++){
		    	for(int j = 0; j < 8; j++){
		    		int no = sc.nextInt();
		    		String result =sc.next(); 
		    		p[j] = new Person(no,result);
		    	    Arrays.sort(p);
		    	    System.out.println(p[0]);
		    	    System.out.println(p[1]);
		    	    nizi[i*2+j] = p[j+2];
		    	}
		    }
		    Arrays.sort(nizi);
		    System.out.println(nizi[0]);
		    System.out.println(nizi[1]);
	}
    class Person implements Comparable<Person> {
        int name;
        String time;
        Person (int name, String time) {
                this.name = name;
                this.time = time;
        }
        @Override
        public String toString() {
            return name + " " + time;
        }
        @Override
        public int compareTo(Person o) {
            return time.compareTo(o.time);
        }
    }
}
		 
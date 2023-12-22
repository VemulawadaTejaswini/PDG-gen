import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        String [] str = new String [a];
        for(int i=0;i<a;i++){str[i] = sc.next();
                            }
		Arrays.sort(str);
        int b = a;
        for(int i=1;i<a;i++){if(str[i].equals(str[i-1])){b--;
                                                 }
                            }        
		System.out.println(b);
	}
}

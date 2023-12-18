import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        String [] str = new String [a];
        for(int i=0;i<a;i++){str[i] = sc.next();
                             in[i] = sc.nextInt();
                            }
		String s = sc.next();
        int b = 0;
		int c = 0;
        for(int i=0;i<a;i++){if(s.equals(str[i])){c=i;break;
                                                 }
                            }
        for(int i=c+1;i<a;i++){b+=in[i];
                              }
		System.out.println(b);
	}
}

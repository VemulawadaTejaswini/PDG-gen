import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
		String s = "APPROVED";
        for(int i=0;i<a;i++){if(in[i]%2==0){if(in[i]%3!=0 && in[i]%5!=0){s="DENIED";break;
                                                                        }
                                                 
                                           }
                            }
       
		System.out.println(s);
	}
}

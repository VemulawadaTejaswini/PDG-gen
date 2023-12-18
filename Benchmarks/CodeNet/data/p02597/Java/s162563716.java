import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int w = 0;
        int r = a;
		String s = sc.next();
        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;
        for(int i=0;i<a;i++){if(s.charAt(i)=='W'){w++;r--;}
                            }
        for(int i=0;i<a-1;i++){if(s.charAt(i)=='W' && s.charAt(i+1)=='R'){ans3++;}
                            }
        int k = w;
        int l = r;
        for(int i=0;i<k;i++){if(s.charAt(i)=='W'){ans1++;}
                            }
        for(int i=0;i<l;i++){if(s.charAt(a-1-i)=='R'){ans2++;}
                            }
		System.out.println(Math.max(ans3,Math.min(ans1,ans2)));
	}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
        int b = 0;
		Long c = a;
        for(int i=1;i<=Math.sqrt(a);i++){if(a%i==0){c=a/i;}
                            }    
        while(c>0){c/=10;
                   b++;
                  }
		System.out.println(b);
	}
}

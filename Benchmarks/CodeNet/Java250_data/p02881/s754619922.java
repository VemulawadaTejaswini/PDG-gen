import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        long b = 1;
        for(long i=1;i<=Math.sqrt(a);i++){if(a%i==0){b=i;
                                                   }                            
                                        }
		System.out.println(b+a/b-2);
	}
}

import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        for(int i=0;i<a;i++){in[i] = sc.nextInt();
                            }
        int search = 1; 
        for(int i=0;i<a;i++){if(in[i]==search){search++;}
                            }
        int ans = a-search+1;
        if(ans==a){ans=-1;}
		System.out.println(ans);
	}
}

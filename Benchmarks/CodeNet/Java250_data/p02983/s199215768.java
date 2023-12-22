import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
        if(r-l>=2019){System.out.println(0);}
        else{l%=2019;
        r%=2019;
        if(l<r){int ans = 2019;
                for(int i=l;i<r;i++){for(int j=i+1;j<=r;j++)
                {ans = Math.min(ans,(i*j)%2019);}
                                    }
                System.out.println(ans);}
		else{System.out.println(0);}
            }
	}
}

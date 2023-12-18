import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ah,bh;
		int as=0,bs=0;
		for(int i=0;i<n;i++){
			ah=sc.nextInt();
			bh=sc.nextInt();
			if(ah>bh) as+=ah+bh;
			else if(ah<bh) bs+=ah+bh;
			else {as+=ah;bs+=bh;}
		}
		sc.close();
		System.out.println("\n"+as+" "+bs);
	}
}
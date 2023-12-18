import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner sc;
		int n,m,ans=0;
		String s=new String();
		String tmpl=new String("I");
		sc=new Scanner(System.in);
		while(true){
			n=sc.nextInt();
			if(n==0){break;}
			m=sc.nextInt();
			s=sc.next();
			for(int i=0;i<n;i++){
				tmpl+="OI";
			}
			for(int i=1;i<=m-2*n;i++){
				int j=s.indexOf(tmpl);
				if(j>=0){
					ans++;
					s=s.substring(j+1,s.length());
				}else{break;}
			}
			System.out.println(ans);
			ans=0;tmpl="I";
		}
	}
}
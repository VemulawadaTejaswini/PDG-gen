import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
      
	Scanner sc = new Scanner(System.in);
	while(true){
	String ans=sc.next();
	if(ans.equals("-")){break;}
	int i=sc.nextInt();
	int j=0;
	while(j<i){
	int k =sc.nextInt();
	 String a=ans.substring(0,k);
	String b=ans.substring(k,ans.length());
	 ans=b+a;
	j++;
	}

	System.out.printf("%s\n",ans);
	}

}
}
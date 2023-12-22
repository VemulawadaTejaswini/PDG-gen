import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		int ans=0;
		for(int i=0;i<string.length();i++){
			ans=ans+Integer.parseInt(string.substring(i,i+1));
			if(ans>=9){ans=ans-9;}
		}
		if(ans==0){System.out.println("Yes");}
		else{System.out.println("No");}
	}
}
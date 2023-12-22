import java.util.Scanner;
public class Main {
private static Scanner sc;

public static void main(String[] args){
	sc = new Scanner(System.in);
	while(true){
		int n=sc.nextInt();
	if(n==0){
		break;
		}
	int [] s= new int[n];
	for(int i=0;i<n;i++){
		s[i]=sc.nextInt();
	}
	for(int i=1;i<n;i++){
		for(int j=0;j<n-i;j++){
			if(s[j]>s[j+1]){
				int c= s[j];
				s[j]=s[j+1];
				s[j+1]=c;
			}
		}
	}
	int sum=0;
	for(int i=1;i<n-1;i++){
		sum+=s[i];
	}
	System.out.println(sum/(n-2));
	}
	
	
}
}
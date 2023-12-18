import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String str[]=new String[a];
		int arr[]=new int[a];
		int ind[]=new int[a];
		for(int i=0;i<a;i++){
			str[i]=sc.next();
			arr[i]=sc.nextInt();
			ind[i]=i+1;
		}
			for(int i=0;i<a-1;i++){
				for(int j=i+1;j<a;j++){
					if(str[i].compareTo(str[j])>0){
						String t=str[i];
						str[i]=str[j];
						str[j]=t;
						int t1=arr[i];
						arr[i]=arr[j];
						arr[j]=t1;
						int t2=ind[i];
						ind[i]=ind[j];
						ind[j]=t2;
					}
						
				}
			}
			for(int i=0;i<a-1;i++){
				for(int j=i+1;j<a;j++){
					if(str[i].compareTo(str[j])==0&&arr[i]<arr[j]){
						String t=str[i];
						str[i]=str[j];
						str[j]=str[i];
						int t1=arr[i];
						arr[i]=arr[j];
						arr[j]=t1;
						int t2=ind[i];
						ind[i]=ind[j];
						ind[j]=t2;
						
					}
				}
			}
					for(int i=0;i<a;i++)
				System.out.println(ind[i]);
	}
}
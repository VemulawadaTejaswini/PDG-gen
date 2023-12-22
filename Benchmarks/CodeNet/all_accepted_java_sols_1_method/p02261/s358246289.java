import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out, true);
		int n=Integer.parseInt(in.nextLine());
		String str=in.nextLine();
		

		String a[]=str.split(" ");
		String a_bub[]=str.split(" ");
		String a_sel[]=str.split(" ");

		//Bubble Sort
		for(int i=0;i<n;i++){
			for(int j=n-1;j>=i+1;j--){
				if((a_bub[j].charAt(1)-'0') < (a_bub[j-1].charAt(1)-'0')){
					String temp=a_bub[j];
					a_bub[j]=a_bub[j-1];
					a_bub[j-1]=temp;
				}
			}
		}

		//Selection Sort
		for(int i=0;i<n;i++){
			int min=i;
			for(int j=i;j<n;j++){
			       if((a_sel[j].charAt(1)-'0') < (a_sel[min].charAt(1)-'0'))
				       min=j;
			}
			String temp=a_sel[i];
			a_sel[i]=a_sel[min];
			a_sel[min]=temp;
		}		

		int flag_1=0;
		int flag=0;

		for(int i=1;i<10;i++){


			ArrayList<String> list_orig=new ArrayList<>();
			for(int j=0;j<a.length;j++){
				if( (a[j].charAt(1)-'0')==i)
					list_orig.add(a[j]);
			}

			ArrayList<String> list_sel=new ArrayList<>();
			for(int j=0;j<a_sel.length;j++){
				if( (a_sel[j].charAt(1)-'0')==i)
					list_sel.add(a_sel[j]);
			}

			ArrayList<String> list_bub=new ArrayList<>();
			
			for(int j=0;j<a_bub.length;j++){
				if( (a_bub[j].charAt(1)-'0')==i)
					list_bub.add(a_bub[j]);
			}

			for(int j=0;j<list_orig.size();j++){
				if(!list_orig.get(j).equals(list_sel.get(j))){
					flag_1=1;
					break;
				}
				if(flag_1==1)
					break;
			}


			for(int j=0;j<list_orig.size();j++){
				if(!list_orig.get(j).equals(list_bub.get(j))){
					flag=1;
					break;
				}
				if(flag==1)
					break;
			}

		}

		for(int i=0;i<n;i++){
			if(i==n-1)
				out.printf(a_bub[i]+"\n");
			else
				out.print(a_bub[i]+" ");
		}
		if(flag==1)
			out.println("Not stable");
		else
			out.println("Stable");


		for(int i=0;i<n;i++){
			if(i==n-1)
				out.printf(a_sel[i]+"\n");
			else
				out.print(a_sel[i]+" ");
		}
		if(flag_1==1)
			out.println("Not stable");
		else
			out.println("Stable");

	}
}


//Surf Smelt Fishing Contest II
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws java.io.IOException {

		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 String line;
		 
		 String[] nq = in.readLine().split(" ");
		 int n= Integer.parseInt(nq[0]);
		 int q= Integer.parseInt(nq[1]);
		
		 String[] av;
		 
		 int a;
		 int v;
		 
		 int[] hist = new int[n];
		 for(int i=0;i<n;i++){
			 hist[i]=-1;
		 }
		 
		 int top=0;
		 int second=0;
		 
		 int count=0;
		 while ((line = in.readLine()) != null) {
		
			 av = line.split(" ");
			 a= Integer.parseInt(av[0])-1;
			 v= Integer.parseInt(av[1]);
			 
			 if(hist[a]==-1){
				 hist[a]++;
			 }
			 hist[a]+=v;
			 
//			 if(count==0||count==1){
			 if(true){
				 for(int i=0;i<n;i++){
					 if(compare(a,top,hist)){
						 second=top;
						 top=a;
					 }
				 }
			 }else{
			 
			 if(compare(a,top,hist)){
				 second =top;
				 top = a;
			 }else if(top!=second&&compare(second,top,hist)){
				 int tmp=top;
				 top = second;
				 second=tmp;
			 }
			 }
			 System.out.println(top+1+" "+hist[top]);
			 count++;
		 }
		 
	}
	
	private static boolean compare(int a, int b, int[] list){
		
		if(list[a]>list[b]){
			return true;
		}else if(list[a]==list[b]&&a<b){
			return true;
		}
		
		return false;
		
	}
	
}

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
			 hist[i]=0;
		 }

		 int top=1;
		 int second=1;

		 int count=0;
		 while ((line = in.readLine()) != null) {

			 av = line.split(" ");
			 a= Integer.parseInt(av[0]);
			 v= Integer.parseInt(av[1]);

			 hist[a]+=v;

			 for(int i=0;i<n;i++){
				 if(compare(a,top,hist)){
					 second=top;
					 top=a;
				 }
			 }

////			 if(count==0||count==1){
//			 if(true){
//				 for(int i=0;i<n;i++){
//					 if(compare(a,top,hist)){
//						 second=top;
//						 top=a;
//					 }
//				 }
//			 }else{
//
//			 if(compare(a,top,hist)){
//				 second =top;
//				 top = a;
//			 }else if(top!=second&&compare(second,top,hist)){
//				 int tmp=top;
//				 top = second;
//				 second=tmp;
//			 }
//			 }
			 System.out.println(top+" "+hist[top]);
			 count++;
		 }

	}

	private static boolean compare(int a, int b, int[] list) {

		if (list[a] > list[b]) {
			return true;
		} else if (list[a] == list[b] && a < b) {
			return true;
		}

		return false;

	}

}
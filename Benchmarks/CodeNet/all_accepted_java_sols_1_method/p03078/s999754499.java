import java.util.*;
import java.util.Map.Entry;
 
class Main {
//	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int X = sc.nextInt();
       int Y = sc.nextInt();
       int Z = sc.nextInt();
       int K = sc.nextInt();
//       int B = sc.nextInt();
//       String S = sc.next();
//       String T = sc.next();
//       char[] s = S.toCharArray();
//       char[] t = T.toCharArray();
       
       long[] a = new long[(int)X];
       for (int i=0 ; i<X; i++) {
           a[i] = sc.nextLong();
       } 
       long[] ab=new long[X*Y];
       long b = 0;
       for (int i=0 ; i<Y; i++) {
           b = sc.nextLong();
           for(int j=0;j<X;j++) {
        	   ab[i*Y+j]=a[j]+b;
           }
       }
       Arrays.sort(ab);
       long[] c = new long[(int)Z];
       for (int i=0 ; i<Z; i++) {
           c[i] = sc.nextLong();
       } 
       Arrays.sort(c);
	   long right=30000000001l;
	   long left=-1;
	   int[] okcnt=new int[X*Y];
	   while(right-left>1) {
		   long mid=left+(right-left)/2;
		   long cnt=0;

		   int zcnt=0;
		   boolean flg=false;
		   for(int i=X*Y-1;i>=0;i--) {
			   while(ab[i]+c[zcnt]<=mid) {
				  if(flg==true) {
					  okcnt[i]=-1;
					  break;
				  }
				  if(zcnt==Z-1) {
					  flg=true;
					  okcnt[i]=-1;
					  break;
				  }
				  zcnt++;
			   }
			   if(flg==false) {
				   okcnt[i]=zcnt;
				   cnt=cnt+Z-zcnt;				   
			   }
		   }
		   if(cnt<K) right=mid;
		   else left=mid;
	   }
       
	   long[] max=new long[3005];
	   Arrays.fill(max, right);
	   int cnt=0;
	   for(int i=0;i<X*Y;i++) {
		   if(okcnt[i]==-1)continue;
		   for(int k=okcnt[i];k<Z;k++) {
			   max[cnt]=ab[i]+c[k];
			   cnt++;
		   }
	   }
       
	   Arrays.sort(max);
	   StringBuffer ans = new StringBuffer();
	   for(int i=0;i<K;i++) {
		   ans.append(max[3004-i]);
		   ans.append("\n");
	   }
	   System.out.println(ans);
   }
      
}
import java.util.*;

class Main{

     static final int N = 4;

  public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     String str = br.readLine();

     String[] strAry = str.split(" ",N);
    
     int ar[] = new int[N];
   
     for(int i=0;i<strAry.length;i++){
	ar[i] = Integer.parseInt(strAry[i]);
     }

    for(int j=0;j<N;j++){
    if(ar[j]==0){
	break;
     }
     else{
        System.out.println("Case " + j + ":" +ar[j]);
     }

     }
    
     
}

}
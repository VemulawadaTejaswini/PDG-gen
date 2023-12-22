import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader read = new BufferedReader(
                new java.io.InputStreamReader(System.in));

       int w = Integer.parseInt(read.readLine());
       int n = Integer.parseInt(read.readLine());
       int [] var = new int [w];
for(int j=0;j<w;j++){
	var[j]=j+1;
}
//String x[] = new String[2];
       for(int i=0;i<n;i++){
    //	   System.out.println("A");
       String x[]= read.readLine().split(",");
       int str[] =new int[2];
       str[0]=Integer.parseInt(x[0]);
       str[1]=Integer.parseInt(x[1]);
    //   System.out.println("B");
       int tmp=var[str[0]-1];

       var[str[0]-1]=var[str[1]-1];
       var[str[1]-1]=tmp;
	  // System.out.println("Str"+str[0]+","+str[1]);

	//   System.out.println("var"+var[0]+","+var[1]);
       //System.out.println(z[2]);
       //System.out.println(x);
	// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
      }
       for(int i=0;i<w;i++){
       System.out.println(var[i]);
       }
	}

}
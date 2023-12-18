import java.io.*;
import java.util.ArrayList;
import java.util.List;
 
// main
 
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //String linebr.readLine()) != null;
 
  while (true) {
	
	   List<Integer> amanda;
	   amanda = getInt(br);
	   int num = amanda.get(0);
	   int kind = amanda.get(1);
	   if(num == 0 && kind == 0) {
		   break;
	   }
	   
	   List<Integer> goukei = getInt(br);
	   List<Integer> init = new ArrayList<Integer>();
	   for(int i=0; i<kind; i++) {
		   init.add(0);
	   }
	   
	   for(int i=0; i<num; i++) {
		   int r = 0;
		   for(int op : getInt(br)){
			 init.set(r,init.get(r) + op);  
			 r++;
		   }
		   
	   }
	   
	   String ans = "Yes";
	   for(int i=0; i<kind; i++) {		  
		   if(goukei.get(i) < init.get(i)) {
			   ans = "No";
		   }
	   }
	   System.out.println(ans);
  }
  }
  
  static List<Integer> getInt(BufferedReader bk) throws IOException {
	  String[] a = bk.readLine().split(" ");
	  List<Integer> k = new ArrayList<Integer>();
	  for(String string : a) {
		  int b = Integer.parseInt(string);
		  k.add(b);
	  }
	  return k;
  }
}


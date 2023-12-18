import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,b=0,c=0,i=0,j=0,k=0,minj=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> SortArray = new ArrayList<Integer>();
    try{
      String line = reader.readLine();
      b = Integer.parseInt(line);
      line = reader.readLine();
      for(String splitted: line.split(" ")){
        SortArray.add(Integer.parseInt(splitted));
      }
		}catch(Exception e){
    }

    int sortArray[] = new int[b];
    for(k = 0;k < b; k++){
      sortArray[k] = SortArray.get(k);
    }

  for(i = b-1;i >= 0;i--){
    System.out.print(sortArray[i]);
    if(i == 0){
    }else{
      System.out.print(" ");
    }
  }
  System.out.print("\r\n");

  }
}

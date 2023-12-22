import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,b=0,c=0,i=0,j=0,k=0;
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

    for (i = 0; i < b - 1; i++) {
      for (j = b - 1; j > i; j--) {
          if (sortArray[j - 1] > sortArray[j]) {
              a = sortArray[j - 1];
              sortArray[j - 1] = sortArray[j];
              c++;
              sortArray[j] = a;
          }
       }
  }

  for(i = 0;i < b;i++){
    System.out.print(sortArray[i]);
    if(i == b - 1){

    }else{
      System.out.print(" ");
    }
  }

  System.out.print("\r\n");
  System.out.println(c);

  }
}

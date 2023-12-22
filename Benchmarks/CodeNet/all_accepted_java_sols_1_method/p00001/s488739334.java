import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.TreeSet;


public class Main {

  /**
   * @param args
   * @throws IOException 
   * @throws NumberFormatException 
   */
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //BufferedReader reader = new BufferedReader(new FileReader("//users/islam/Desktop/InputData.txt"));
    String line;
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    while((line = reader.readLine()) != null){
      numbers.add(Integer.parseInt(line));
    }
    Collections.sort(numbers);
    for(int i = 0; i< 3; i++){
      System.out.println(numbers.get(numbers.size()-(i+1)));
      
    }
  }

}
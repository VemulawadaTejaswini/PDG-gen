import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;


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
    
    TreeSet<Integer> numbers = new TreeSet<Integer>();
    
    while((line = reader.readLine()) != null){
      numbers.add(Integer.parseInt(line));
    }
    
    for(int i = 0; i<3; i++){
      System.out.println(numbers.last());
      numbers.remove(numbers.last());
    }
  }

}
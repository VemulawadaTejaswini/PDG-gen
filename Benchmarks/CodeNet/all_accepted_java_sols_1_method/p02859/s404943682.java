import java.io.*;import java.util.*;class Main { 
  public static void main(String[] args) throws java.lang.Exception { 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

    int[] intArray = Arrays.stream(br.readLine().split(" ")) .mapToInt(Integer::parseInt) .toArray(); 
    int r = intArray[0]; 
    
    int circl = r * r;
    System.out.println(circl);
  }               
}
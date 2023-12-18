import java.util.Collections;

class myClass {
  public static void main(String[] args) {
    List<String> list = Arrays.adList(args);

    Collections.reverse(list);
    
    for(String c:list){
      System.out.print(c);
    }
    System.out.println();
  }
}
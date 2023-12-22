import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    LinkedList<Double> material = new LinkedList<Double>();
    for(int i = 0; i < n; i++){
      material.add(sc.nextDouble());
    }
    
    while(material.size() > 1){
      //降順にソートしてから前2つを取り出し生成物を1つプッシュ
      Collections.sort(material);
      material.add((material.pollFirst() + material.pollFirst()) / 2);
    }
    
    System.out.println(material.peek());
  }
  
}
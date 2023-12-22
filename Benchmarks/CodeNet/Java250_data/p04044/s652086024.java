import java.util.Scanner;

class Main{
  public static void main(String[] args){
    int n = 0;
    int k = 0;
    Scanner s = new Scanner(System.in);
    n = Integer.parseInt(s.next());
    k = Integer.parseInt(s.next());
    String buffer = "";
    String[] array = new String[n];
    for(int i=0; i<n; i++){
      array[i] = s.next();
    }

    for(int i=0; i<n-1; i++){
      for(int j=n-1; i<j; j--){
        if(array[j].compareTo(array[j-1])<0){
          buffer = array[j];
          array[j] = array[j-1];
          array[j-1] = buffer;
        }
      }
    }

    for(int i=0; i<n; i++){
      if(i==n-1){
        System.out.println(array[i]);
      }else{
        System.out.print(array[i]);
      }
    }
  }
}

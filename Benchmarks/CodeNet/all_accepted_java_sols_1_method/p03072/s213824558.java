import java.util.Scanner ;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in) ;
    int N  =scan.nextInt();
    int arr[] = new int[N];
    for(int i = 0 ;i<N ;i++){
      arr[i] = scan.nextInt();
    }
    int count2 = 1 ;
    for(int i =N-1 ; i>=1 ; i--){
      int count = 0 ;
      for(int j = i-1 ; j>=0;j--){
        if(arr[i]>=arr[j]){
          count++;
        }
      }
      if(count == i){
        count2++;
      }
    }
    System.out.println(count2);
  }
}

import java.util.Scanner;

class Main{
  static public void main(String args[]){
    int N;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int vec1[] = new int[N];
    int vec2[] = new int[N];
    for(int i = 0; i < N; i++){
    vec1[i] = sc.nextInt();
  }
  for(int i = 0; i < N; i++){
  vec2[vec1[i]-1] = i + 1;
  }
  for(int i = 0; i < N; i++){
    System.out.print(vec2[i] + " ");
  }
  }
}

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int N[] = new int[1000];
    double SD[] = new double[1000];
    double Ave,Sum;
    int Num,K=0;

    while(true){
      Num = scanner.nextInt();
      Ave = 0;
      Sum = 0;
      if(Num==0){
        break;
      }
      for(int i=0;i<Num;i++){
        N[i] = scanner.nextInt();
        Ave += N[i];
      }
      Ave /= Num;

      for(int i=0;i<Num;i++){
        Sum += (N[i]-Ave)*(N[i]-Ave);
      }

      SD[K] = Math.sqrt(Sum/Num);
      K++;
    }

    for(int i=0;i<K;i++){
      System.out.println(SD[i]);
    }

  }
}


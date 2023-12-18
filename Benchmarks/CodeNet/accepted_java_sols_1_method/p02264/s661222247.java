import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int q = sc.nextInt();

    int s = 0;
    int g = n-1;

    int tt = 0;

    String[] name = new String[n];
    int[] time = new int[n];

    for(int i=0; i<n; i++){
      name[i] = sc.next();
      time[i] = sc.nextInt();
    }

    while(true){
      if(time[s] > q){
        time[(g+1)%n] = time[s]-q;
        name[(g+1)%n] = name[s];
        tt = tt+q;
        g = (g+1)%n;
        s = (s+1)%n;
      }
      else{
        tt = tt+time[s];
        if(s == g){
          System.out.println(name[s]+" "+tt);
          break;
        }
        else{
          System.out.println(name[s]+" "+tt);
          s = (s+1)%n;
        }
      }
    }

  }
}


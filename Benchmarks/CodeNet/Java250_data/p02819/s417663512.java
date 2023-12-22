import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt() - 1;
    boolean bl = false;
    do{
      n++;
      bl = isPrime(n);
    }while(!bl);
    System.out.println(n);
  }
  public static boolean isPrime(int n){
    int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313};
    for(int i = 0; i < 65; i++){
      if(n % prime[i] == 0 && n / prime[i] != 1){
        return false;
      }
    }
    return true;
  }
}
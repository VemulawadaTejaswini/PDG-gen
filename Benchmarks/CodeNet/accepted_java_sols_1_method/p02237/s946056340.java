import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numV = scan.nextInt();
    int[] adjMat = new int[numV*numV];
    for(int i=0; i< numV; i++){
      int u = scan.nextInt();
      int numA = scan.nextInt();
      for(int j=0; j<numA; j++){
        int v = scan.nextInt();
        adjMat[(u-1)*numV+(v-1)] = 1;
      }
    }
    String str = "";
    for(int i=0; i<numV; i++){
      for(int j=0; j<numV; j++){
        str += adjMat[i*numV+j];
        if(j!=numV-1)
        str += " ";
        if(j==numV-1 && i!=numV-1 ){
            str += "\n";
        }
      }
    }
    System.out.println(str);
  }
}

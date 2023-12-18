import java.util.Scanner;

public class Main {
  int[] doIt(String data){
    int time = -1;
    int lpmax = data.length();
    int[] res = new int[lpmax];
    
    for(int i = 0;i<lpmax;i++){
      switch(data.charAt(i)){
        case 'c':
          time = 0;
          res[i] = time++;
          break;
        case '.':
          res[i] = time;
          if(time != -1) time++;
          break;
      }
    }
    return res;
  }

  void dispLine(int[] data){
    int lpmax = data.length;
    for(int i = 0;i<lpmax;i++){
      System.out.print(data[i]);
      if(i != lpmax - 1) System.out.print(" ");
    }
    System.out.println();
  }
  
  public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int h = sc.nextInt(),w = sc.nextInt();
	    int[][] res = new int[h][w];
	    Main ma = new Main();

	    for(int i = 0;i<h;i++) res[i] = ma.doIt(sc.next());
	    for(int i = 0;i<h;i++) ma.dispLine(res[i]);
	    sc.close();
	  }
}
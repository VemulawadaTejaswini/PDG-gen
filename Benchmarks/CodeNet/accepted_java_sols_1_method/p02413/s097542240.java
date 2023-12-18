import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int r, c;

    Scanner in = new Scanner(System.in);

    r = in.nextInt();
    c = in.nextInt();

    int [][] output = new int[r+1][c+1];

    for(int i=0; i<output.length-1; i++){
        in.nextLine();
        for(int j=0; j<output[0].length-1; j++){
            output[i][j] = in.nextInt();
        }
    }

    for(int i=0; i<output.length; i++)
        output[i][output[0].length-1] = 0;

    for(int i=0; i<output[0].length-1; i++)
        output[output.length-1][i] = 0;

    for(int i=0; i<output.length-1; i++){
        for(int j=0; j<output[0].length-1; j++){
            output[i][output[0].length-1] += output[i][j];
            output[output.length-1][j] += output[i][j];
        }
    }

    for(int i=0; i<output[0].length-1; i++)
        output[output.length-1][output[0].length-1] += output[output.length-1][i];

    for(int i=0,j; i<output.length; i++){
        for(j=0; j<output[0].length-1; j++){
            System.out.print(output[i][j] + " ");
        }
        System.out.print(output[i][j]);
        System.out.println();
    }

  }
}
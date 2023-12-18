import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    int i=0;
    int[] array=new int[10000];

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    for(int j=0;j<array.length;j++){
      array[j]=Integer.parseInt(br.readLine());
      if(array[j]==0){
        break;
      }
      i++;
    }

    for(int j=0;j<i;j++){
      System.out.println("Case "+(j+1)+":"+array[j]);
    }
  }
}

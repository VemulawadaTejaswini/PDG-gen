import java.io.* ;
public class Main{
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int data [] = new int[n];
    int count = 0;

    for(int i=0; i<n; i++){
      for(int j=0; j<n-i; j++){
        if(data[j]<data[j+1]){
          int temp=data[j];
          data[j]=data[j+1];
          data[j+1]=temp;
          count += 1;
        }
      }
    }
    for(int k=0; k<data.length; k++){
      System.out.print(data[k]+" ");
      System.out.println(count);
    }
  }
}
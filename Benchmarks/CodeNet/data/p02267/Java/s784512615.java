import java.util.*;
// import java.io.*;
class Main{
  public static void main(String args[])throws Exception{
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int number = 0;
    // int n = Integer.parseInt(br.readLine());
    int n = sc.nextInt();
    // String [] S = br.readLine().split("\\s+");
    int [] array_s = new int[n];
    for(int i =0; i<n; i++){
      array_s[i] = sc.nextInt();
    }

    // int q = Integer.parseInt(br.readLine());
    int q = sc.nextInt();
    // String [] T = br.readLine().split("\\s+");
    int [] array_t = new int[n];
    int t;
    for(int i = 0; i<q; i++){
      t = sc.nextInt();
      for(int j = 0; j<n; j++){
        if(t == array_s[j])count++;
      }
    }

    System.out.println(count);
  }
}

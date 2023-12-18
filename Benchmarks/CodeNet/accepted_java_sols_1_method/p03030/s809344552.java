import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String[] s = new String[n];
      int[] p = new int[n];
      int[] index = new int[n];

      sc.nextLine();
      for (int i = 0; i < n; i++) {
        s[i] = sc.next();
        p[i] = sc.nextInt();
        index[i] = i + 1;
      }
      for(int i=0; i<n-1; i++){
        for(int j=0; j<n-1-i; j++){
          if(s[j].compareTo(s[j+1]) > 0){
            String temp=s[j];
            s[j]=s[j+1];
            s[j+1]=temp;
            int temp_p=p[j];
            p[j]=p[j+1];
            p[j+1]=temp_p;
            int temp_i=index[j];
            index[j]=index[j+1];
            index[j+1]=temp_i;
          } else if (s[j].compareTo(s[j+1]) == 0) {
            if (p[j] < p[j+1]){
              String temp=s[j];
              s[j]=s[j+1];
              s[j+1]=temp;
              int temp_p=p[j];
              p[j]=p[j+1];
              p[j+1]=temp_p;
              int temp_i=index[j];
              index[j]=index[j+1];
              index[j+1]=temp_i;
            }
          }
        }
      }
      for(int i=0; i<n; i++){
        System.out.println(index[i]);
      }
    }
  }
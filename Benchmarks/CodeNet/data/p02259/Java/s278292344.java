import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num_list = new int[n];
    for (int i = 0; i < n; i++){
      num_list[i] = sc.nextInt();
    }
    sc.close();
    
    bubble_sort(num_list, n);
  }

  public static void output(int[] lst, int n){
    for (int i = 0; i < n; i++){
      if (i == n - 1){
        System.out.println(lst[i]);
      }else{
        System.out.print(lst[i] + " ");
      }
    }
  }

  public static void bubble_sort(int[] lst, int n){
    int count = 0;
    for (int i = lst.length - 1; i > 0; i--){
      for (int j = 0; j < i; j++){
        if (lst[j] > lst[j + 1]){
          int tmp = lst[j];
          lst[j] = lst[j + 1];
          lst[j + 1] = tmp;
          count ++;
        }
      } 
    }
    output(lst, n);
    System.out.println(count);
  }
}


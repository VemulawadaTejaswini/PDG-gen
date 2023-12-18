public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int ans = 0;
    for (int i = 1; i < n; i++) {
      int x = i;
      int y = i;
      if((x*x+y*y)<=d*d){
        ans += 1;
      }
    }
    System.out.println(ans);

  }
}

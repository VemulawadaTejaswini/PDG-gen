class Main{
  void doIt(){
    for(int i = 1;i <= 9;i++){
      for(int k = 1;k <= 9;k++){
        System.out.printf("%dx%d=%d\n",i,k,(i*k));
      }
    }
  }
  public static void main(String[] args){
    new Main().doIt();
  }
}
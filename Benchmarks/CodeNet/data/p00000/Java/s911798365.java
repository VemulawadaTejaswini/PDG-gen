class Main{
    public static void main(String[] a){
      int x = 0;
      int y = 0;
      int num = 0;
      for(int i = 1; i < 9; i++){
        for(int j = 1; j < 9; j++){
          num = x * y;
          print(i + "x" + y + "y=" + num);
        }
      }
    }
}


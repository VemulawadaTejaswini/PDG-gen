class Main{
    public static void main(String[] a){
      int[] a = {1,2,3,4,5,6,7,8,9};
      int[] b = a;
      for(int multiplicand:a){
        for(int multiple:b){
          System.out.println(multiplicand + "*" + multiple + "=" multiplicand*multiple);
        }
      }
    }
}
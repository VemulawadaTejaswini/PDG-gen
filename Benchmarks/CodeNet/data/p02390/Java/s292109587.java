class Main{
   public static void main(String[] args){
       int S = 46979;
       int h, m , sec;
       h = S / 3600;
       S = S % 3600;
       m = S / 60;
       sec = S % 60;
       
       System.out.println(h + ":" + m + ":" + sec);
   }
}
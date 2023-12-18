import java.util.Scanner;

   class Main{
      public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

       int []m =new int[6];

       for(int i =0;i<6;i++){
          m[i] =scan.nextInt();
       }

       String str = scan.next();

       for(int i =0;i<str.length();i++){
          char b = str.charAt(i);

             if(b=='N'){
                int x = m[0];
                m[0] = m[1];
                m[1] = m[5];
                m[5] = m[4];
                m[4] = x;
             } else if(b=='S'){
                int x = m[0];
                m[0] = m[4];
                m[4] = m[5];
                m[5] = m[1];
                m[1] = x;
             } else if(b=='E'){
                int x = m[0]; 
                m[0] = m[3];
                m[3] = m[5];
                m[5] = m[2];
                m[2] = x;
             } else {
                int x = m[0];
                m[0] = m[2];
                m[2] = m[5];
                m[5] = m[3];
                m[3] = x;
             }

       }

       System.out.println(m[0]);

 
       }
   }

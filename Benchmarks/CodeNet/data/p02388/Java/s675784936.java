class Main{
     
      public int pow3(int num){
        int answer=1;
        for(int i=0;i<3;i++){
          answer *= num;
        }
        return answer;
      }
         
      public static void main(String args[]){
        Main m = new Main();
       
        System.out.println(m.pow3(2));
        System.out.println(m.pow3(3));
      }
    }
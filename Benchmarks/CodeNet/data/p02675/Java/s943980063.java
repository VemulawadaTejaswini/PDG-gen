String op(int n){

      if(n%10==3){
         return "bon";
      }else if(n%10==0||n%10==1||n%10==6||n%10==8){
         return "pon";
      }else{
         return "hon";
      }
   }
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int buildcnt = sc.nextInt();
        int hights[]= new int[buildcnt];
            boolean reach =false;
      String answer = "Yes";
        for(int i=0 ; i<buildcnt ; i++){
         hights[i]=sc.nextInt(); 
        }
//      List<Integer> numlist = new ArrayList<Integer>();
//      while(sc.hasnext()){
  //      numlist.add(sc.nextInt());
    //  }
      for(int i=buildcnt-1 ; i>0 ; i--){
          if(hights[i-1] - hights[i] >1 ){
            answer = "No";
            break;
          }else if(hights[i-1]-hights[i]==1 && !reach){
            reach=true;
          }else if(hights[i-1]-hights[i]==1 && reach){
            answer="No";
            break;
          }else if(hights[i-1]-hights[i]==0 && reach){
            reach=true;
          }else{
            reach=false;
          }
      }

//      int now = sc.nextInt();
//      while(sc.hasNext()){
//       int next = sc.nextInt();
       //今-次が2以上ならNG
 //      if(now - next >= 2){
//         answer="NO";
  //       break;
  //     }else if(now - next == 1){
        
  //       if(reach == true){
  //        answer ="NO";
  //         break;
  //       }else{
  //         reach=true;
  //         now = next;
  //       }
  //     }else{
  //      now = next;
  //      reach=false;
  //     }
   //   }
        // 出力 
		System.out.println(answer);
//      		System.out.println(buildcnt);
//      for(int i=0;i<buildcnt;i++){
//      		System.out.println(hights[i]);
//      }
	}
}

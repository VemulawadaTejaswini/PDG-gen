
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Y
 */
//ITP1_11???DICE4
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        saikoro[] d = new saikoro[N]; 
        
        for(int i = 0;i<N;i++){
            d[i] = new saikoro(br.readLine());
        }
        
        boolean A = true;
        for(int i = 0;i<N;i++){
            for(int j = i+1;j<N;j++){
                if(d[i].Equals(d[j])){
                    A = false;
                }
            }
        }
        if(A){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
    
    
}
    

    

class saikoro{
    String a[]; //???????????????????????¨???
    String b[]; //??????????????????????????¨???
    String tmp;
    
    
    
    saikoro(String a){
        this.a = new String[6];
        this.a = a.split(" ");   //java p486?????§
        this.b = new String[6];
        this.b[0]="1"; this.b[1]="2"; this.b[2]="3"; 
        this.b[3]="4"; this.b[4]="5"; this.b[5]="6";
    }
    
    void N(){
        tmp = this.a[0];
        this.a[0] = this.a[1]; this.a[1] = this.a[5]; 
        this.a[5] = this.a[4]; this.a[4] = tmp; 
        tmp = this.b[0];
        this.b[0] = this.b[1]; this.b[1] = this.b[5]; 
        this.b[5] = this.b[4]; this.b[4] = tmp; 
    }
    void S(){
        tmp = this.a[0];
        this.a[0] = this.a[4]; this.a[4] = this.a[5]; 
        this.a[5] = this.a[1]; this.a[1] = tmp; 
        tmp = this.b[0];
        this.b[0] = this.b[4]; this.b[4] = this.b[5]; 
        this.b[5] = this.b[1]; this.b[1] = tmp; 
    }
    void W(){
        tmp = this.a[0];
        this.a[0] = this.a[2]; this.a[2] = this.a[5];
        this.a[5] = this.a[3];  this.a[3] = tmp;
        tmp = this.b[0];
        this.b[0] = this.b[2]; this.b[2] = this.b[5];
        this.b[5] = this.b[3];  this.b[3] = tmp;
    }
    void E(){
        tmp = this.a[0];
        this.a[0] = this.a[3];  this.a[3] = this.a[5];
        this.a[5] = this.a[2];  this.a[2] = tmp;
        tmp = this.b[0];
        this.b[0] = this.b[3];  this.b[3] = this.b[5];
        this.b[5] = this.b[2];  this.b[2] = tmp;
    }
    
    public String getS(int n){
        return this.a[n];
    }
    
    public String getBottom(int n){
        switch(n){
            case 0: 
                return a[5]; 
            case 1: 
                return a[4];
            case 2: 
                return a[3];
            case 3:
                return a[2]; 
            case 4:
                return a[1]; 
            case 5:
                return a[0];
            default: 
                return null;
            
        }
         
    }
    
    // ??????????????????????????¢???TOP(????????????)??? saikoro x?????¢n???????????????
    public void toTop(saikoro x,int n){
        if(x.a[n].equals(this.a[0])){
            
        }else if(x.a[n].equals(this.a[1])){
            this.N();
        }else if(x.a[n].equals(this.a[2])){
            this.W();
        }else if(x.a[n].equals(this.a[3])){
            this.E();
        }else if(x.a[n].equals(this.a[4])){
            this.S();
        }else if(x.a[n].equals(this.a[5])){
            this.N(); this.N();
        }
    }
    //?????????????????¢???FRONT(2?????????)???
    public void SideRoll(saikoro x,int n){
        if(x.a[n].equals(this.a[1])){
            
        }else if( x.a[n].equals(this.a[2]) ){
            this.SideMove();
        }else if( x.a[n].equals(this.a[4]) ){
            this.SideMove(); this.SideMove(); 
        }else if( x.a[n].equals(this.a[3])){
            this.SideMove(); this.SideMove(); this.SideMove();
        }
    }
    
    //?????´?????????????????¢
    void SideMove(){
        tmp = this.a[1];
        this.a[1] = this.a[2];  this.a[2] = this.a[4];
        this.a[4] = this.a[3];  this.a[3] = tmp;
        tmp = this.b[1];
        this.b[1] = this.b[2];  this.b[2] = this.b[4];
        this.b[4] = this.b[3];  this.b[3] = tmp;
    }
    
    public boolean Equals(saikoro x){
        boolean A = false;
        for(int i = 0; i<6; i++){
            for(int j = 0; j<4;j++){
                toTop(x, i); 
                
                for(int l = 0;l<j;l++) x.SideMove();
              
                
                for(int k = 0; k<6; k++){
                    if(this.a[k].equals(x.a[k])){
                        A = true;
                    }else{
                        A = false;
                        break;
                    }
                }
                if(A == true) return true;
                
            }
        }
        return false;
    }
    
}
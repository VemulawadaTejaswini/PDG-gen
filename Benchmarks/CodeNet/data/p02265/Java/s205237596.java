import java.util.*;
import java.io.*;
import java.lang.Integer;

class Main{
  static List dummy;

  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    init();
    for(int i = 0 ; i<n; i++){
      String [] s = br.readLine().split("\\s+");
      if(s[0].charAt(0)=='i'){
        insert(Integer.valueOf(s[1]));
      }else if(s[0].length()>6){
        if(s[0].charAt(6)=='F'){
          deleteFirst();
        }else if(s[0].charAt(6)=='L'){
          deleteLast();
        }
      }else{
        delete(Integer.valueOf(s[1]));
      }
    }
    Print_list();
  }
  static void init(){
    dummy = new List();
    dummy.setnext(dummy);
    dummy.setprevious(dummy);
  }
  //insert
  static void insert(int n){
    List list = new List(n);
    list.setnext(dummy.getnext());
    dummy.getnext().setprevious(list);
    dummy.setnext(list);
    list.setprevious(dummy);
  }
  //ノードの削除メソッド
  static void deleteNode(List delete){
    if( delete == dummy)return;
    delete.getprevious().setnext(delete.getnext());
    delete.getnext().setprevious(delete.getprevious());
  }
  //指定したノードの削除
  static void delete(int n){
    deleteNode(listSearch(n));
  }
  //firstnode削除
  static void deleteFirst(){
    deleteNode(dummy.getnext());
  }
  //lastnode削除
  static void deleteLast(){
    deleteNode(dummy.getprevious());
  }
  //keyを使ってノードを探索
  static List listSearch(int n){
    List cur = dummy.getnext();
    while(cur.getdata()!=n && cur!=dummy){
      cur = cur.getnext();
    }
    return cur;
  }
  //printメソッド
  static void Print_list(){
    List list = dummy.getnext();
    if(list != dummy){
      System.out.printf("%d",list.getdata());
      list = list.getnext();
    }
    while(list!=dummy){
      System.out.printf(" %d",list.getdata());
      list = list.getnext();
    }
    System.out.println();
  }
}
//list操作


//listの構造体的役割
class List{
  private int data;
  private List next;
  private List previous;

  public List(){
  }

  public List(int n){
    this.data = n;
  }

  public List getnext(){
    return this.next;
  }

  public void setnext(List n){
    this.next = n;
  }

  public List getprevious(){
    return previous;
  }

  public void setprevious(List p){
    this.previous = p;
  }

  public int getdata(){
    return data;
  }
}


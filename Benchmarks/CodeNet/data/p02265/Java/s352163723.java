import java.util.*;
import java.io.*;
//fastest
class Main{
  static List dummy;

  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    init();
    int i;
    String s;
    int key = 0;
    for(i = n ; i>0; i--){
      StringTokenizer token = new StringTokenizer(br.readLine());
      s = token.nextToken();
      if(s.length()<=6)key= Integer.parseInt(token.nextToken());
      if(s.charAt(0)=='i'){
        insert(key);
      }else if(s.length()>6){
        if(s.charAt(6)=='F' ){
          deleteFirst();
        }else if(s.charAt(6)=='L'){
          deleteLast();
        }
      }else{
        delete(key);
      }
    }
    Print_list();
  }
  static void init(){
    dummy = new List();
    dummy.next=dummy;
    dummy.previous=dummy;
  }
  //insert
  static void insert(int n){
    List list = new List(n);
    list.next=dummy.next;
    dummy.next.previous=list;
    dummy.next=list;
    list.previous=dummy;
  }
  //ノードの削除メソッド
  static void deleteNode(List delete){
    if( delete == dummy)return;
    delete.previous.next=delete.next;
    delete.next.previous=delete.previous;
  }
  //指定したノードの削除
  static void delete(int n){
    deleteNode(listSearch(n));
  }
  //firstnode削除
  static void deleteFirst(){
    deleteNode(dummy.next);
  }
  //lastnode削除
  static void deleteLast(){
    deleteNode(dummy.previous);
  }
  //keyを使ってノードを探索
  static List listSearch(int n){
    List cur = dummy.next;
    while(cur.data!=n && cur!=dummy){
      cur = cur.next;
    }
    return cur;
  }
  //printメソッド
  static void Print_list(){
    List list = dummy.next;
    if(list != dummy){
      System.out.printf("%d",list.data);
      list = list.next;
    }
    while(list!=dummy){
      System.out.printf(" %d",list.data);
      list = list.next;
    }
    System.out.println();
  }
}
//listの構造体的役割
class List{
  public int data;
  public List next;
  public List previous;

  public List(){}
    public List(int n){
      this.data = n;
    }
  }


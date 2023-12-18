from decimal import Decimal
def main():
    a, b = input().split(" ")
    a = int(a)
    b = Decimal(b)
    print(a*b)
    
if __name__ == "__main__":
    main()
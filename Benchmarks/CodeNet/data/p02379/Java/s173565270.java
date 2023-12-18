import math
def main():
    (a, b, c) = map(int, raw_input().split())
    print "%.8f" % (a * b * math.sin(math.radians(c)) / 2.0)
    print "%.8f" % (a + b + math.sqrt(a ** 2.0 + b ** 2.0 - (2.0 * a * b * math.cos(math.radians(c)))))
    print "%.8f" % (b * math.sin(math.radians(c)))

if __name__ == '__main__':
    main()
